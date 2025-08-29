  const express = require("express");
  const bodyParser = require("body-parser");
  const cors = require("cors");
  const app = express();

  const corsOptions = {
    origin: "*"
  };

  
  app.use(cors(corsOptions));
  app.use(bodyParser.json());
  app.use(bodyParser.urlencoded({ extended: true }));


    const db = require("./API_UNIVERSIDAD/models");

  db.sequelize.sync()
    .then(() => {
      console.log("Base de datos sincronizada.");
    })
    .catch(err => {
      console.error("Error al sincronizar la base de datos:", err.message);
    });


  require("./API_UNIVERSIDAD/routes/student.route.js")(app);
  require("./API_UNIVERSIDAD/routes/teacher.router.js")(app);
  require("./API_UNIVERSIDAD/routes/curso.route.js")(app);
  require("./API_UNIVERSIDAD/routes/asignacion.router.js")(app);
  require("./API_UNIVERSIDAD/routes/grado.router.js")(app);
  require("./API_UNIVERSIDAD/routes/admin.router.js")(app);

  app.get("/", (req, res) => {
    res.json({ message: "Bienvenido a la API de la UMG." });
  });

  const PORT = process.env.PORT || 8081;
  app.listen(PORT, () => {
    console.log(`Servidor corriendo en el puerto ${PORT}.`);
  });
     