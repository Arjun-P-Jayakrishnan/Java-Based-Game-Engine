package steam;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;

public class Window {
    private int width;
    private int height;

    private String title;

    private static Window window =null;

    private Window(){
        this.width=1920;
        this.height=1080;
        title="Mario";
    }

    public static Window get(){
        if(Window.window==null){
            Window.window=new Window();
        }
        return Window.window;
    }

    public void run() {
        System.out.println("Hello LWJGL"+ Version.getVersion()+"!");

        init();
        loop();
    }

    public void init(){
        GLFWErrorCallback.createPrint(System.err).set();
    }

    public void loop(){

    }
}
