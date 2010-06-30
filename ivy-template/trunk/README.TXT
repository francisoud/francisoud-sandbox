This project does nothing except 
provide ivy already configured files with a simple example .

We defined dependencies on cxf, jms and junit to demonstrate the use of conf: runtime,compile and test
ivysetting: Commented is a custom maven2 enterprise repo.

Also 2 useful ant target: 
- install ivy
- convert a pom.xml to an ivy.xml

Everything is done so that the project doesn't depend on any external file (ex: ivysetting is in project etc...).

You need to add the lib to the eclispe claspath by hand but I think it's pretty straight forward.
Anyway I'm in favor of putting the .* files under SCM.
