CREATE USER facturacion IDENTIFIED BY facturacion;

GRANT CREATE SESSION TO facturacion;
GRANT CREATE TABLE TO facturacion;
GRANT CREATE VIEW TO facturacion;
GRANT CREATE ANY TRIGGER TO facturacion;
GRANT CREATE ANY PROCEDURE TO facturacion;
GRANT CREATE SEQUENCE TO facturacion;
GRANT CREATE SYNONYM TO facturacion;

--CREACION DE TABLA CLIENTE
CREATE TABLE tbl_cliente(
    id                  NUMBER(10),
    identificacion      VARCHAR2(20 CHAR),
    nombre              VARCHAR2(50 CHAR),
    apellido            VARCHAR2(50 CHAR),
    
    CONSTRAINT id_PK PRIMARY KEY (id)
);
CREATE INDEX idx_identifiacion ON tbl_cliente(identificacion);