# evalartBanistmo
evalartBanistmo

Cordial saludo!

En el repositorio anterior tuve bastantes problemas, me encontré con un error que no me permitía avanzar y con la premura del tiempo intenté formular código funcional. Sin embargo, me tomé la libertad de comenzar de nuevo con mejores prácticas y ser mas claro en la documentación, ya que debido a la premura del tiempo de la prueba, los nervios me jugaron una mala pasada y me parece que el trabajo entregado no habla por mi trabajo. Muchas gracias.

El proyecto lo creé en GitHub simplemente con el Readme y luego de clonarlo en mi local, construí el proyecto en grdle.
(git clone https://github.com/johanmudea/evalartBanistmo.git)
Luego de construirlo hice git add . y git commit -m "" para salvar la información generada y luego de esto hacerle push al remoto y ver que todo esté en orden.

Se probó un flujo en el carrito del sitio web, para lo cual se realizó un primer flujo manual para verificar la funcionalidad, además con apoyo de selenium IDE y de la consola del navegador, se comenzaron a recolectar algunos localizadores.

Inicialmente, organicé los paquetes del patrón de diseño, luego de crear los archivos obligados de gradle para gestionar las dependencias, los Logs y el archivo de serenity.properties.

Luego de crear los paquetes en Test y descargar el driver del navegador comence con el feature en cucumber y asociandolo a sus respectivos runners y steps definitions.
las clases creadas allí se getionaron para poderse correr en diferentes plataformas.

en los paquetes de Main comencé generando las clases de user interface para la landing page, allí se pusieron los localizadores entre xpath y css.

Al ser un flujo la unica clase de tarea contiene todos los movimientos a realizar.

En el paquete Question está la clase de validación donde se captura el valor.

Finalmente, en los steps definitions se diligenciaron los métodos given, when, then y las comparaciones finales.

Al terminar y verificar el desarrollo.

git add .
git commit -m ""
git push




