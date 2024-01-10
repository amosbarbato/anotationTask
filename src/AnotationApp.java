import java.lang.reflect.Method;

public class AnotationApp {
    public static void main (String[] args) {
        tabClass tab = new tabClass();
        System.out.println("*** Lendo anotação ***");
        Method[] methods = tab.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(tabTest.class)) {
                tabTest test = method.getAnnotation(tabTest.class);
                String valor = test.valor();
                int num = test.num();

                System.out.println("Método: " + method.getName());
                System.out.println("Valor: " + valor);
                System.out.println("Número: " + num);
            }
        }
    }
}
