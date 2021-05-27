package scl.edu.gt;

public class CommandList {

	String command [] = new String [12];
	String information [] = new String [12];
	
	int cantidadDeComados;
	
	CommandList() {
		
		command[0] = "suma";
		command[1] = "resta";
		command[2] = "division";
		command[3] = "multiplicacion";
		command[4] = "residuo";
		command[5] = "help";
		command[6] = "exit";
		command[7] = "kernel";
		command[8] = "red";
		command[9] = "bios";
		command[10] = "CPU";
		command[11] = "procesador";
		
		
		information[0] = "El comado puede realizar la suma de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[1] = "El comado puede realizar la resta de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[2] = "El comado puede realizar la division de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[3] = "El comado puede realizar la multiplicacion de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[4] = "El comado puede realizar la residuo de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[5] = "El comado puede realizar la help de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[6] = "El comado puede realizar la exit de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[7] = "El Kernel o núcleo, es una parte fundamental  del sistema operativo que se encarga de conceder \nel acceso al hardware de forma \n segura para todo el software que lo solicita.";
		information[8] = "Una red de computadoras, también llamada red \n de ordenadores o red informática, es un conjunto de equipos conectados por medio \n de cables, señales, ondas o cualquier otro método de transporte de datos.";
		information[9] = "El propósito fundamental del BIOS es iniciar, y \nprobar el hardware del sistema y cargar un gestor de arranque o un sistema \n operativo desde un dispositivo de almacenamiento de datos.";
		information[10] = "CPU son las siglas de Central Processing Unit, \n lo que traducido significa Unidad Central de Procesamiento. ";
		information[11] = "El procesador (CPU, Central Processing Unit) es  \nel componente más importante de nuestro PC.";
	}
	
		
}