Purpose : Using DB via RESP API

Sprint Boot + Java  + Mongo DB


Student Entity

GET  http://localhost:8080/students                                 -> List all students
GET  http://localhost:8080/studentbylastname?lastname=Salmanoğlu    -> List students by last name. 
POST http://localhost:8080/student                                  -> Save/Update student by posting JSON

Ex:

{
    "id": "1",
    "firstName": "Ömer",
    "lastName": "Salmanoğlu"
}







