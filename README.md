## 🎮ARSW-Parcial-TicTacToe

  Teniendo como referencia el ejercicio propuesto para el parcial nos tocaba construir una aplicación interactiva usando WebSockets que permita crear una sala, entrar a una sala, jugar a dos jugadores, etc.
- Para realizar la implementacion hice varias clases con diferentes propositos:
  
1. Esta la clase **AppService.java** en la cual implemente un poco de la logica del juego, entonces ella permite crear una sala, reiniciarla cuando se termina la partida, actualizarla cuando se va jugando,
   se validan las jugadas verificando los turnos, posiciones y cambia el jugador a medida que el juego avanza:

   <img width="982" height="823" alt="image" src="https://github.com/user-attachments/assets/f753a595-5263-4f62-a664-8ee059eff7c9" />

3. Esta la clase **ArswApplication.java** la cual es la encargada de iniciar con Spring Boot para poder correrla:

   <img width="702" height="422" alt="image" src="https://github.com/user-attachments/assets/7ec72c8b-69ee-47fa-b208-0a1c4f209eb1" />

4. Esta la clase **GameSate.java** en el cual se inician los valores para las salas, el tablero, etc:

   <img width="723" height="295" alt="image" src="https://github.com/user-attachments/assets/1d44f799-471a-4199-9c11-9feb7a11e21d" />

5. Esta tambien la clase **TicController.java** la cual hace parte de la comunicacion usando WebSockets, usa la logica de igual manera de **AppService.java**, maneja rutas especificas (mensajes) para que los clientes se puedan unir a las salas,
   moverse en el tablaro o volver a jugar:

   <img width="964" height="431" alt="image" src="https://github.com/user-attachments/assets/f4083fd9-820f-428d-9b93-5a6812888401" />

7. Tenemos **WebSocketConfig.java** la cual maneja la logica como tal del Web Socket:

   <img width="679" height="794" alt="image" src="https://github.com/user-attachments/assets/668c61c1-46aa-40fa-810b-aaaec8a750bc" />
   
8. Tambien se tiene la parte del front que maneja la aplicacion como tal:

   <img width="290" height="248" alt="image" src="https://github.com/user-attachments/assets/cda15ada-3010-4801-9720-c3b1c7c9046b" />



