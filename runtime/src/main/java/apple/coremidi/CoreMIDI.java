package apple.coremidi;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMIDI")
public class CoreMIDI 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MIDINetworkBonjourServiceType")
    public static native NSString NetworkServiceTypeBonjour();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MIDINetworkNotificationContactsDidChange")
    public static native NSString NetworkNotificationContactsDidChange();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MIDINetworkNotificationSessionDidChange")
    public static native NSString NetworkNotificationSessionDidChange();
    
}
