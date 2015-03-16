package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox/AudioToolbox.h")
public class AudioServices 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesPlayAlertSound")
    public static native void playAlertSound(int inSystemSoundID);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesPlaySystemSound")
    public static native void playSystemSound(int inSystemSoundID);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesCreateSystemSoundID")
    public static native int createSystemSoundID(CFURL inFileURL, Todo outSystemSoundID);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesDisposeSystemSoundID")
    public static native int disposeSystemSoundID(int inSystemSoundID);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesAddSystemSoundCompletion")
    public static native int addSystemSoundCompletion(int inSystemSoundID, CFRunLoop inRunLoop, CFString inRunLoopMode, FunctionPtr inCompletionRoutine, Todo inClientData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesRemoveSystemSoundCompletion")
    public static native void removeSystemSoundCompletion(int inSystemSoundID);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesGetPropertyInfo")
    public static native int getPropertyInfo(int inPropertyID, int inSpecifierSize, Todo inSpecifier, Todo outPropertyDataSize, Todo outWritable);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesGetProperty")
    public static native int getProperty(int inPropertyID, int inSpecifierSize, Todo inSpecifier, Todo ioPropertyDataSize, Todo outPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioServicesSetProperty")
    public static native int setProperty(int inPropertyID, int inSpecifierSize, Todo inSpecifier, int inPropertyDataSize, Todo inPropertyData);
    
}
