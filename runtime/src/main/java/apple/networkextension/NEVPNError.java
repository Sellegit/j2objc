package apple.networkextension;


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
@Library("NetworkExtension/NetworkExtension.h")
public class NEVPNError 
    extends Todo 
     {

    
    
    protected NEVPNError() {}

    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NEVPNErrorDomain")
    public static native String getClassDomain();

}
