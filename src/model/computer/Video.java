package model.computer;

public interface Video {

    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHelloFrom(){
        System.out.println("Hello from default video");
    }
}
