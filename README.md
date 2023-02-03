# java-io-concepts

### java.io --> Java Input and Output

> read/write or input/output


> [Source] 	-->	[Apps/Program] 	--> [Destination]

> [File1.txt] --> 	[Program] 		--> [File2.txt]


> [File1.txt] --> 	[Program] 		--> [Console]


> [Console] 	--> 	[Program] 		--> [File2.txt]


> [Console] 	--> 	[Program] 		--> [Console]


### Input/Ouput types:-
1. #### Byte(1B or 8 bit) Streaming(Sequence of elements/Data)
2. #### Char(2B or 16 bit) Streaming(Sequence of elements/Data) for characters.

### Byte Streaming:--
### ```InputStream```
1. > This abstract class is the superclass of all classes representing an input stream of bytes. 
2. > Applications that need to define a subclass of InputStream must always provide a method that returns the next byte of input.

### ```FileInputStream```
1. > Creates a FileInputStream by opening a connection to an actual file, the file named by the path name name in the file system. A new FileDescriptor object is created to represent this file connection. 
2. > First, if there is a security manager, its checkRead method is called with the name argument as its argument. 
3. > If the named file does not exist, is a directory rather than a regular file, or for some other reason cannot be opened for reading then a FileNotFoundException is thrown.

### ```FileOutputStream```
1. > Creates a file output stream to write to the file with the specified name. A new FileDescriptor object is created to represent this file connection. 
2. > First, if there is a security manager, its checkWrite method is called with name as its argument. 
3. > If the file exists but is a directory rather than a regular file, does not exist but cannot be created, or cannot be opened for any other reason then a FileNotFoundException is thrown.

### ```ByteArrayInputStream```
1. > A ByteArrayInputStream contains an internal buffer that contains bytes that may be read from the stream. An internal counter keeps track of the next byte to be supplied by the read method.
2. > Closing a ByteArrayInputStream has no effect. The methods in this class can be called after the stream has been closed without generating an IOException.

### ```ByteArrayOutputStream```
1. > This class implements an output stream in which the data is written into a byte array. The buffer automatically grows as data is written to it. The data can be retrieved using toByteArray() and toString(). 
2. > Closing a ByteArrayOutputStream has no effect. The methods in this class can be called after the stream has been closed without generating an IOException.