module.exports = (sequelize, Sequelize) => {
    const Student = sequelize.define("student", {
        id: {
            type: Sequelize.INTEGER,
            primaryKey: true,
            autoIncrement: true,
        },
        nombre: {
            type: Sequelize.STRING
        },
        email: {
            type: Sequelize.STRING
        },
        carnet: {
            type: Sequelize.INTEGER
        }
    });
    return Student;
}; 