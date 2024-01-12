This is a Directory-File System application using the Proxy design pattern.

FileSystem (Singleton class)
– Has a static factory method: getFileSystem()
– Assumed this file system can have multiple “drives” (multiple tree structures) in it.
	• c.f., C, D and E drives in Windowse

Directory
– A LinkedList<FSElement> children: data field to reference files and subdirectories in a directory
– countChildren(): returns the number of files and
subdirectories in a directory.
– getTotalSize(): returns the total disk consumption by all the files and subdirectories under a directory

FSElement
- Created to eliminate the duplication (and potential laborious and error-prone maintenance work) by
	– moving those common data fields and their getter/setter methods to a super class of Directory and File.

Link
– A link acts as a proxy of a directory or file.
– A link can act as a proxy of another link too. 
