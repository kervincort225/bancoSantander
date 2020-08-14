 create table santander.usuario(
  ID_USUARIO serial,
  nombre varchar,
  apellido varchar,
  codigoTarjeta int,
  primary key(ID_USUARIO)
 );
 create table santander.tarjeta(
  ID_TARJETA serial,
  NUMERO_TARJETA int,
  primary key (ID_TARJETA)
 );
 
  alter table santander.usuario
   add constraint FK_tarjetas
   foreign key (codigoTarjeta)
   references santander.tarjeta(NUMERO_TARJETA);