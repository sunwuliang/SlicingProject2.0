SlicingProject2.0
=================
The slicing project (ClassModelSlicing) is used to slice a .ecore class model and a .xmi object configuration based on one or many OCL invariants.
It has dependency with three other projects: org.csu.slicing.uml2, org.csu.slicing.coachbuswithedatatype, and org.csu.slicing.coachbus. These three projects are automatically generated from the corresponding *.genmodels.
The org.csu.slicing.uml2 project is used to create instances of UML2 metamodel, while the other two projects, creating instances of CoachBus class model, are used for testing and example demonstration. 

Below is a descrition of a list of folders/files in the ClassModelSlicing project:
1. ecores folder includes a list of .ecore class models; 
2. ocls folder includes a list of .ocl files; 
3. xmis folder includes a list of .xmi object configurations; 
4. slices folder includes a list of slicing results including sliced class models, object configurations, and invariants; 
5. src folder includes the Java source files for the slicing project. 

The src.org.csu.slicing package has three sub-packages: evaluation, instance, main, test and util. 
The entry pint of the project is in the main package, specifically the OCSlicer class. 
In the main package, the Footprinter class is used to slice a .ecore class model, 
the OCSlicer class is used to sliced a .xmi object configurations.
In the evaluation package, the Evaluator class is used to check if an (sliced) object configuration is 
consistent with a (sliced) class model with one or many invariants. 
In the instance package, InsGenerator is used to generate random instances of the UML2 class model, and 
Ecore2XMI is used to generate an instance in the form of the .core file to an instance in the form of the .xmi file.
In the util package, EMFHelper is used to load/save .ecore, .ocl and .xmi files, 
InvPrePostAnalzyer uses RefModelElmtsVisitor to identify the class model elements that are referenced 
by one or many invariants, RefModelElmtsVisitor implements the AbstractVisitor class from the Eclipse 
OCL project, SizeCalculator is used to measure the size of class models (in terms of number of classes, 
attributes, etc. ) and object configurations (in terms of objects, links, and slots), 
and UML2Invs uses a HashMap to store the OCL invariants defined in the UML2 class model.
