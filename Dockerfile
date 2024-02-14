FROM mysql:latest

#RUN apt-get update
#
#RUN apt-get install -y curl

ENV MYSQL_ROOT_PASSWORD root

COPY ./table-creation.sql /docker-entrypoint-initdb.d/table-creation.sql

EXPOSE 3306 8080



