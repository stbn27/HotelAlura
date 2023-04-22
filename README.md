<!-- Proyecto: Challenge Hotel Alura-->

#### 🌐 Socials:
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/stbn27) 
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/estebanjose27) 
[![Github](https://img.shields.io/badge/github-%23171515.svg?logo=GitHub&logoColor=white)](https://github.com/stbn27) 
[![Orancle](https://img.shields.io/badge/Oracle-%23CD5C5C.svg?logo=Oracle&logoColor=white)](https://oracle.com/stbn27) 


![Hotel Alura](/img-Proyect/logo.png)
# Hotel Alura  :star:
---
## Este proyecto  forma parte del curso de **Oracle Next Education** impartido en la plataforma de **Alura Latam**.
 Este proyecto consiste en un programa que se encargue de gestionar  un hotel  :hotel: (**Hotel Alura**). Los empleados podran hacer el registro de los huespedes. Para el desarrollo de este proyecto se siguio la metodología MVC y algunas bibliotecas de terceros, el programa esta elaborado en lenguaje **Java** :coffee: para toda la interfaz  y **MySQL** para la base de datos.
### Componentes:  :pencil:
- :one: Vista de inicio de sesión.
- :two: Vistra principal (registro de huespedes)
	- Modificar informacion de usuario
- :three: Vista administracion de huespedes
- :four: Vista administracion de habitaciones
- :five: Vista configuraciones (Solo administradores)
	- Vista añadir nuevo usuario

1.  :arrow_forward: Vista inicio de sesion
Este el primer apartado que se ejecuta el programa donde se inicia la sesion de **Usuario**, que a su vez este prodra tener un rol de *administrador* o bien de *empleado* , si posee el rol de administrador este podra ejecutar todas las opciones disponibles en el programa caso contrario no tendra acceso a la vista de configuraciones.

![Inicio-Sesión](/img-Proyect/login.gif)

--- 

2. :arrow_forward: Vista principal (DashBoard)
Una vez que el usuario haya ingresado sus credenciales correctamente se le abrira esta vista en donde prodra seleccionar las otras interfaces o bien registrar un nuevo huesped.
En caso de que desee **registrar un nuevo huesped** solo le permite hacerlo a las habitaciones disponibles, ya que las habitaciones cuentas con tres estados: `Disponible`(verde), `Ocupado`(rojo), `Mantenimiento`(azul). Todos los campos estan validados y no permite arrojar informacion erronea, si el usuario ha rellenado todos los campos y presiona el boton de registar:
	- Automaticamente se enviara la informacion a la base de datos
	- La habitacion pasara ha estado de `Ocupado` y no le permitira elegirla de nuevo.
	- Se le abrira un pdf donde contiene la información del hotel (*Proveniente de la vista de configuraciones*), información del huesped y además información de su habitacion.
	- Se le redigira nuevamente al panel dashboar donde la habitacion pasara a un background rojo(ocupado).
El hotel tiene 5 pisos donde cada piso contiene 9 habitaciones por ende posee un total de 45 habitaciones.

![Sistema-Principal](/img-Proyect/dash.gif)

---

3. :arrow_forward:  Vista administración de huespedes
En esta ventana el empleado podra ver todos los huespedes alojados en el hotel actualmente al igual que visualizar la información (pdf) de cada huesped o bien modificar la informacion del huesped en casa de haya un error (no le permite cambiar de habitación). Y la ultima opcion que tiene disponible es eliminar un huesped, al seleccionar esta opcion:
	- La habitacion quedara en estado de `Activo`(verde).
	- El huesped se eliminara del registro de la base de datos.
	- En la vista dashboar automaticamente tomara un colo verde de background.
Todos los cambios realizados se ejecutaran en la base de datos automaticamente.
En la parte superior de este Jpanel se encuentra un campo para buscar cualquier huesped mediante su nombre o telefono.
![Huespedes](/img-Proyect/huesped.gif)

---

4.  :arrow_forward:  Vista administración de Habitaciones.
En esta vista el empleado podra ver el listado de todas las habitaciones,  en caso de que la habitación se encuentre en ocupada, esta aparecera en resaltado y dependiendo de su estado este desplegara otras opciones:
	- Ocupada:
		- Editar información del huesped actual
		- Ver el archivo pdf generado cuando este hizo la reserva.
	- Disponible
		- Podra colocarla en estado de mantenimento
	- Mantenimiento
		- Podra colocarla en disponible, para que la rente algun huesped
Todos los cambios realizados se ejecutaran en la base de datos automaticamente.
De la misma manera que en el punto anterior, se encuentra un campo para buscar mediante el numero de habitación o bien por el estado en que se encuentra.
![Habitaciones](/img-Proyect/habitacion.gif)

---

5.  :arrow_forward:  Vista configuración
Como se menciono esta vista esta disponible unicamente para los administradores, ya que a los empleados no les aparecera esta opción.
En esta ventana se puede modificar la informacion de la empresa, esta información se impreme en los pdf generados al realizar una reservación. De igual manera estan validados los campos, en caso de que el usuario deje campos vacios no se ejecuta la actualización de información.
El otro apartado es agregar un nuevo usuario el cual puede ser `Administrador` o `Trabajador` ; cuando se abre esta ventana(`JFrameForm`) el usuario no puede volver a la ventana anterior hasta que la actual haya sido cerrada(`dispose()`).
![Configuración](/img-Proyect/configura.gif)

---

### :white_check_mark: Tecnologias utilizadas para el desarrollo de este programa.
 
![NetBeans](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white) Como editor principal del código se ultilizo **Apache netbeans IDE 16**

![MySQl](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white "MySQL") Donde se desarrollo la **base de datos**  relacional.

![Trello](https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white) Seguimineto del desarrollo de este programa. (Proporcionado por el equipo de **Alura Latam**).

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white "Java") Lenguage principal en el que fue desarrollado el programa, Java(TM) SE 19.0.2

![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white) Control del versiones del proyecto.

![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white "Figma") Para el diseño de la interfaz

![VisualStudioCode](https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white) Desarrollo del Readme



### :small_orange_diamond: Librerias (jar) utilizadas:
![Driver1](https://img.shields.io/badge/Libreria-JCalendar_1.4-orange?)
![Driver2](https://img.shields.io/badge/Libreria%20-AbsoluteLayout-green?)
![Driver3](https://img.shields.io/badge/Libreria%20-mysql_Conector_j_8.0.32_-blue?)
![Driver4](https://img.shields.io/badge/Libreria%20-itext_pdf_5.0.3-red?)

---
---

#### :beginner: Otros

**Las imagenes e iconos utilizados fueron obtenidos de:**

:open_file_folder: [icoFinder](https://www.iconfinder.com/)

:open_file_folder: [Repositorio gitHub ](https://github.com/alura-challenges/challenge-one-alura-hotel-latam) @genesysaluralatam

---




[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/stbn27) 
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/estebanjose27) 
[![Github](https://img.shields.io/badge/github-%23171515.svg?logo=GitHub&logoColor=white)](https://github.com/stbn27) 

---
![Alura](/img-Proyect/Alura.svg "Alura Latam") 
[![oracle](/img-proyect/oracle.svg "Orancle sitio Oficial")](https://orancle.com)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white "Java")
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white "MySQL")

---

![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white "Figma")
![VisualStudioCode](https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![Trello](https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![NetBeans](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white)
![MySQl](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white "MySQL")

![Sistema](https://img.shields.io/badge/Intel-Core_i5_7th-0071C5?style=for-the-badge&logo=intel&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)

---
> :star: ¡¡Ayudame con una estrilla!!

![MadeIn](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)
![Licencia](https://img.shields.io/github/license/{stbn27}/{HotelAlura}.svg)

**Autor**
Autor: Jose Julian Esteban
@Autor stbn27
![Autor](https://img.shields.io/github/realese/{stbn27}/{HotelAlura}.svg)
