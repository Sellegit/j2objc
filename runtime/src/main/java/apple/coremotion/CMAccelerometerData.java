package apple.coremotion;


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
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreMotion/CoreMotion.h") @Mapping("CMAccelerometerData")
public class CMAccelerometerData 
    extends CMLogItem 
     {

    
    
    public CMAccelerometerData() {}
    
    
    @Mapping("acceleration")
    public native CMAcceleration getAcceleration();
    
    
    
    
    
}
