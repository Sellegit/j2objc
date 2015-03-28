package apple.gamecontroller;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;


@Library("GameController/GameController.h") @Mapping("GCControllerButtonInput")
public class GCControllerButtonInput 
    extends GCControllerElement 
     {

    
    
    @Mapping("init")
    public GCControllerButtonInput() { }

    
    @Mapping("valueChangedHandler")
    public native @Block VoidBlock3<GCControllerButtonInput, Float, Boolean> getValueChangedHandler();
    @Mapping("setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock3<GCControllerButtonInput, Float, Boolean> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("pressedChangedHandler")
    public native @Block VoidBlock3<GCControllerButtonInput, Float, Boolean> getPressedChangedHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPressedChangedHandler:")
    public native void setPressedChangedHandler(@Block VoidBlock3<GCControllerButtonInput, Float, Boolean> v);
    @Mapping("value")
    public native float getValue();
    @Mapping("isPressed")
    public native boolean isPressed();

    
    


}
