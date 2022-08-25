# Banco
TestJava

Informacion tecnica:

jdk1.8.0_202.jdk (Java SE 8 Archive Downloads (JDK 8u202 and earlier)
Apache NetBeans 14

Hay 2 metodos de realizar esta accion.

Opcion 1:

Propiedad tipo arreglo multidimencional.

  private String[][] aclientes; 

La asignacion se puede realizar de la siguiente forma.

  aclientes[0][0] = cui0;
  aclientes[0][1] = nombre0;
  aclientes[0][2] = apellido0;
  
  aclientes[1][0] = cui1;
  aclientes[1][1] = nombre1;
  aclientes[1][2] = apellido1;
  
  aclientes[n][0] = cuin;
  aclientes[n][1] = nombren;
  aclientes[n][2] = apellidon;
  
Opcion 2:

Propiedad tipo arreglo multi dimencional de un tipo de objeto.

  private DatosCliente[] _clientes = DatosCliente[5];
  
La asignacion se puede realizar de la siguiente forma.

 * _clientes[0] = new DatosCliente(cui0,nombre0,apellido0);
 * _clientes[1] = new DatosCliente(cui1,nombre1,apellido1);
 * _clientes[n] = new DatosCliente(cuin,nombren,apellidon);
 
 Agregadas las Ventanas de:
 
 - Crear Cliente. (listo)
 - Crear Cuenta y su vinculacion a un Cliente. (listo)
 - Visualizar Informacion Cliente. (listo)
 - Movimientos.  <==== Trabajando
 - Detalle Transacciones. <===== Pendiente
 
 Validaciones efectuadas:
 
 - Maximo de Clientes a poder crear.
 - Maximo de Cuentas por Cliente a poder crear.
 - Aceptar numeros en el campo de CUI para ventana Cliente
 - Aceptar numeros en el campo de CUI para ventana Informacion.
 
 
