package apple.coretelephony;


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


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("CoreTelephony/CTCall.h") @Mapping("CTSubscriberInfo")
public class CTSubscriberInfo 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CTSubscriberInfo() { }

    


    
    
    @Mapping("subscriber")
    public static native CTSubscriber getSubscriber();

}
