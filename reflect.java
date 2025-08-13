import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Class Details:\n");
            Class student = Class.forName("Student");
            System.out.println("Class Name : " + student.getName());
            System.out.println("Modifier of class : " + Modifier.toString(student.getModifiers()));

            System.out.println("\nConstructuor Details:\n ");

            Constructor[] constructors = student.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                String name = constructor.getName();
                int parameterCount = constructor.getParameterCount();

                String accessModifier = Modifier.toString(constructor.getModifiers());
                if (accessModifier.isEmpty())
                    accessModifier = "default";

                System.out.println("Constructor Name: " + name);
                System.out.println("Modfiier: " + accessModifier);
                System.out.println("Parameter Count : " + parameterCount);
                Parameter[] parameters = constructor.getParameters();
                for (Parameter parameter : parameters) {
                    String parameterName = parameter.getName();
                    String dataType = parameter.getType().getName();
                    System.out.println("name: " + parameterName + " ; data type : " + dataType);

                }
                System.out.println();

            }

            System.out.println("\nMethods\n");
            Method[] methods = student.getDeclaredMethods();
            for(Method method:methods){
                String methodName = method.getName();
                String accessModifier = Modifier.toString(method.getModifiers());
                if(accessModifier.isEmpty()){
                    accessModifier = "default";
                }

                String returnType = method.getReturnType().getSimpleName();
                int parameterCount = method.getParameterCount();
                System.out.println("name: "+methodName);
                System.out.println("access Modfier: "+accessModifier);
                System.out.println("return Type: "+returnType);
                System.out.println("Parameter Count: "+parameterCount);
                 Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    String parameterName = parameter.getName();
                    String dataType = parameter.getType().getSimpleName();
                    System.out.println("name: " + parameterName + " ; data type : " + dataType);
                    System.out.println("\n");

                }
                System.out.println("\n");
                
            }

            System.out.println("Fields: ");
            Field [] fields = student.getFields();
            for(Field field:fields){
                String fieldName = field.getName();
                String dataType = field.getType().getSimpleName();
                String modfiier = Modifier.toString(field.getModifiers());
                if(modfiier.isEmpty()){
                    modfiier = "default";
                }

                System.out.println("Name of fields : "+fieldName);
                System.out.println("Data Type: "+dataType);
                System.out.println("access Modifier: "+modfiier);
                System.out.println("\n");
            }

        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}
