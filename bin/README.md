Steps to run the project in eclipse

1. clone this project 
git clone 

import the project in eclipse


create a database and table using following command in mysql:

using following command

CREATE DATABASE /*!32312 IF NOT EXISTS*/`spring-mvc` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `spring-mvc`;

/*Table structure for table `number` */

DROP TABLE IF EXISTS `number`;

CREATE TABLE `number` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `counter` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `number` */

insert  into `number`(`id`,`counter`) values (1,0);


Run the project by right click on project Run on Server
if deployment fails then look for the log:

-Dwtp.deploy=<workspace>\.metadata\.plugins\org.eclipse.wst.server.core\tmp2\wtpwebapps

got to the direcotory <workspace>\.metadata\.plugins\org.eclipse.wst.server.core\tmp2\wtpwebapps
and see if the project spring-rest-proj deployed, and if the spring-rest-proj\WEB-INF\lib dir exist
if not project delete from eclipse, then go to :
<workspace>\spring-rest-proj
then delete 
a) .project
b) .class
c) .settings

and re-import it into eclipse
 
