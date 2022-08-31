# Banco
TestJava

Informacion tecnica:

jdk1.8.0_202.jdk (Java SE 8 Archive Downloads (JDK 8u202 and earlier)
Apache NetBeans 14

Hay 2 metodos de realizar esta accion.

Forma de almacenar la informacion:

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
 - Movimientos.  (listo)
 - Detalle Transacciones. (listo)
 
 Validaciones efectuadas:
 
 - Maximo de Clientes a poder crear.
 - Maximo de Cuentas por Cliente a poder crear.
 - Aceptar numeros en el campo de CUI para ventana Cliente
 - Aceptar numeros en el campo de CUI para ventana Informacion.

 Pendientes

 - Algunas imagenes y mejorar diseno de las interfaces graficas (ventanas)
 - Deshabilitar los datos de prueba en banco.menu

 
 
