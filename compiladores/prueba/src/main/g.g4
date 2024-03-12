grammar g;

@parser::header{
import java.util.HashMap;
import java.util.Map;
import org.example.models.VariableInfo;

}

@parser::members{
    Map<String, VariableInfo> tabla_simbolos = new HashMap<>();
}

programa: sentencias;

sentencias: (declaraciones | declaracion_asignacion |asignacion|lectura | escritura)*;

declaraciones: (ID tipo PUNTO_COMA)
{
String variableId = $ID.text;

        if (!tabla_simbolos.containsKey(variableId)) {
            System.out.println("Declarando variable");
            tabla_simbolos.put(variableId, new VariableInfo($tipo.text, 0));
        } else {
            System.out.println("Error: Variable '" + variableId + "' ya declarada.");
        }

};

declaracion_asignacion: (ID tipo IGUAL expresion PUNTO_COMA)
{

     String variableId = $ID.text;
     String variableTipo = $tipo.text;
         if (!tabla_simbolos.containsKey(variableId)) {
             Object expresionValue = $expresion.value;

             if (expresionValue != null) {
                  switch (expresionValue.getClass().getSimpleName()) {
                          case "Integer":
                              if (variableTipo.equals("Entero")) {
                                System.out.println("Declarando y asignando variable");
                                tabla_simbolos.put(variableId, new VariableInfo($tipo.text, expresionValue));
                              } else {
                                  System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
                              }
                              break;
                          case "String":
                              if (variableTipo.equals("Texto")) {
                                  System.out.println("Declarando y asignando variable");
                                  tabla_simbolos.put(variableId, new VariableInfo($tipo.text, expresionValue));
                              } else {
                                  System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
                              }
                              break;
                          case "Double":
                              if (variableTipo.equals("Real")) {
                                  System.out.println("Declarando y asignando variable");
                                  tabla_simbolos.put(variableId, new VariableInfo($tipo.text, expresionValue));
                              } else {
                                  System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
                              }
                              break;
                          default:
                              System.out.println("Error: Tipo de dato no compatible '" + expresionValue.getClass().getSimpleName() + "'.");
                  }
             }
         } else {
             System.out.println("Error: Variable '" + variableId + "' ya declarada.");
         }

 };


asignacion: ID IGUAL expresion PUNTO_COMA
{String variableId = $ID.text;
     VariableInfo variableInfo = tabla_simbolos.get(variableId);

     if (variableInfo != null) {
         Object expresionValue = $expresion.value;

        if (expresionValue != null) {
             switch (expresionValue.getClass().getSimpleName()) {
                     case "Integer":
                         if (variableInfo.getType().equals("Entero")) {
                             System.out.println("Asignando variable");
                             variableInfo.setValue(expresionValue);
                         } else {
                             System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
                         }
                         break;
                     case "String":
                         if (variableInfo.getType().equals("Texto")) {
                             System.out.println("Asignando variable");
                             variableInfo.setValue(expresionValue);
                         } else {
                             System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
                         }
                         break;
                     case "Double":
                         if (variableInfo.getType().equals("Real")) {
                             System.out.println("Asignando variable");
                             variableInfo.setValue(expresionValue);
                         } else {
                             System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
                         }
                         break;
                     default:
                         System.out.println("Error: Tipo de dato no compatible '" + expresionValue.getClass().getSimpleName() + "'.");
             }
        }
     } else {
         System.out.println("Error: Variable '" + variableId + "' no declarada.");
     }
};

tipo: 'Entero' | 'Real' | 'Texto';

escritura: 'Mensaje.Texto'ABRIR_PAR expresion  CERRAR_PAR PUNTO_COMA {System.out.println($expresion.value);};

lectura: (ID IGUAL llamadaCaptura PUNTO_COMA)
{
     String variableId = $ID.text;
     VariableInfo variableInfo = tabla_simbolos.get(variableId);

        if (variableInfo != null) {
         Object expresionValue = $llamadaCaptura.value;
                 System.out.println("Lectura exitosa");
                 variableInfo.setValue(expresionValue);
         }else {
           System.out.println("Error: Variable '" + variableId + "' no declarada.");
         }

}
;

llamadaCaptura returns [Object value]
    : 'Captura.Texto()' { $value = leerInput(); }
    | 'Captura.Entero()' { $value = Integer.parseInt(leerInput()); }
    | 'Captura.Real()' { $value = Double.parseDouble(leerInput()); }
    ;


expresion returns [Object value]:
    t1 = factor_exp {$value = $t1.value;}
    (MAS t2=factor_exp {
            if ($value instanceof Integer && $t2.value instanceof Integer) {
                $value = (int)$value + (int)$t2.value;
            } else if ($value instanceof Double && $t2.value instanceof Double) {
                $value = (double)$value + (double)$t2.value;
            } else {
                System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos");
            }
        })*
    (MENOS t2=factor_exp {
             if ($value instanceof Integer && $t2.value instanceof Integer) {
                 $value = (int)$value - (int)$t2.value;
             } else if ($value instanceof Double && $t2.value instanceof Double) {
                 $value = (double)$value - (double)$t2.value;
             } else {
                 System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos");
             }
         })*
    ;

factor_exp returns [Object value]:
    t1 = atomica_exp {$value = $t1.value;}
    (MULT t2=factor_exp {
                if ($value instanceof Integer && $t2.value instanceof Integer) {
                    $value = (int)$value * (int)$t2.value;
                } else if ($value instanceof Double && $t2.value instanceof Double) {
                    $value = (double)$value * (double)$t2.value;
                } else {
                    System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos.");
                }
            })*
    (DIV t2=factor_exp {
             if ($value instanceof Integer && $t2.value instanceof Integer) {
                 $value = (int)$value / (int)$t2.value;
             } else if ($value instanceof Double && $t2.value instanceof Double) {
                 $value = (double)$value / (double)$t2.value;
             } else {
                 System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos.");
             }
         })*
    ;

atomica_exp returns [Object value]:
ID {$value = tabla_simbolos.get( $ID.text).getValue();} | ENTERO {$value = Integer.parseInt($ENTERO.text);} |
REAL {$value = Double.parseDouble($REAL.text);} | TEXTO {$value = $TEXTO.text;} | ABRIR_PAR e=expresion CERRAR_PAR {$value = $e.value;};

//cadena: '"' .*? '"';

//INDENTIFICADOR
ID: [a-zA-Z_][a-zA-Z0-9_]*;

//CONSTANTES
ENTERO: [0-9]+;
REAL: [0-9]+('.'[0-9]+)?;
TEXTO: '"' .*? '"';
//OPERADORES
IGUAL: '=';
MAS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';

PUNTO_COMA: ';';
ABRIR_PAR: '(';
CERRAR_PAR: ')';

COMENTARIO: '//' ~[\r\n]* -> skip;
COMENTARIO_MULTILINEA: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;