# Blockchain-y-Registro
Contiene los java web services del proyecto
## BlockChain:
Este proyecto es un Web Services, que sube los datos de un bloque conformados por un Código, Nonce, Data, Hash y Hash preview, 
se realizan los bloques con una "lista" simplemente enlazada, desarrollada por mi mismo en una clase Java en un paquete diferente, 
al paquete donde se encuentra el proyecto principal.

### Métodos:
* Consultar Dirección:
  + **Parámetros Web:**
    - Dirección: Es un parámetro de tipo String, recibe la dirección de una wallet.
* Registrar Datos:
  + **Parámetros Web:**
    - Texto: Es el parámetro que recibe los datos entre las wallets (Direcciones y monto).
    - Nonce: Es un número aleatorio que aporta al hash para generar un bloque.
    - Hash: Es un String conformado por letras y números.
* Crear Bloque:
  + Este método no cuenta con parámetros web, pero consiste en la creación de un bloque (Nodo), en la lista simplemente enlazada.
### Paquetes:
* _com.mycompany.blockchain_: Contiene la clase principal denominada "Blockchain" y la clase "datos" (Utilizada para la captura de datos)
* _com.mycompany.blockchain.utility_: Contiene las clases "Node" y "Lista", las cuales conforman la lista simplemente enlazada.
### Clases: _Lista y Node_
* Lista:
  + **Metodos**
    - printList(): Utilizada para imprimir la lista.
    - insertAtBegin(): Este método ingresa los datos a cada nodo (bloque).
    - isEmpty(): Se utiliza como un Flag (Bandera) para saber si la lista esta vacía.
    - size(): Este método recorre toda la lista y determina su tamaño.
    - buscar(): Utilizado para buscar en un nodo especifico, una dirección correspondiente a una wallet.
* Node:
  + **Metodos**
    - **NOTA: Esta clase cuenta con polimorfismo, por lo que contamos con dos métodos del mismo nombre.**
    - Node(): Este se utiliza sin parámetros y sin ningún tipo de parámetros, por lo general se utiliza en la instancia de la clase.
    - Node(_int code, int nonce, String data, String anthash, String prehash_): Esta ingresa al nodo (bloque), todos los datos del
      BlockChain.
    - toString(): Este método se implementa para imprimir los datos de la clase (**_NOTA_** No está en uso en el código).
    
## Register:
Registro cumple la función de validar 2 direcciones de tipo char (wallets) y un valor numérico de tipo double (Monto).

### Paquetes:
* _com.mycompany.register_: Este paquete almacena las clases que dan funcion a todo el sistema de registro.
### Clases:
* Auxiliar:
  + **Metodos:**
    - num(): Esté método valida que el ingreso del monto sea de valor númerico, retorna un valor boolean que nos permita  
    confirmar, resive un parametro de tipo double.
* Register:
  + **Metodos:**
    - ValidarDirecciones(): Este metodo, valida a través de diferentes condicionales, las direcciones cumplan tanto con el
    número de caracteres, como con los caracteres validos de cada una de las direcciones wallet.
   
    




