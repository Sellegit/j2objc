package apple.mediaplayer;


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
import apple.uikit.*;


/**
 * @since Available in iOS 4.2 and later.
 */
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaEntity")
public class MPMediaEntity 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MPMediaEntity() { }

    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("persistentID")
    public native long getPersistentID();

    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("enumerateValuesForProperties:usingBlock:")
    public native void enumerateValues(NSSet<?> properties, @Block VoidBlock3<NSString, NSObject, Todo> block);
    @Mapping("valueForProperty:")
    public native Object getValue(String property);
    @Mapping("canFilterByProperty:")
    public static native boolean canFilterByProperty(String property);

}
