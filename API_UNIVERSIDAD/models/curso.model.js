module.exports = (sequelize, Sequelize) => {
    const Curso = sequelize.define("cursos", {
        id: {
            type: Sequelize.INTEGER,
            primaryKey: true,
            autoIncrement: true,
        },
        nombre: {
            type: Sequelize.STRING
        },
        código: {
            type: Sequelize.INTEGER
        },
        semestre: {
            type: Sequelize.STRING
        }
    });
    return Curso;
}; 