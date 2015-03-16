package apple.security;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Security/Security.h")
public class SecRandom 
    extends Object 
     {

    
    
    protected SecRandom() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecRandomDefault")
    public static native SecRandom Default();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecRandomCopyBytes")
    public static native int copyBytes(SecRandom rnd, @MachineSizedUInt long count, Todo bytes);
    
}
