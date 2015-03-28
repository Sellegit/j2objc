package apple.corebluetooth;


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
import apple.dispatch.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreBluetooth/CoreBluetooth.h")
public class CBError 
    extends Todo 
     {

    
    
    protected CBError() {}

    
    
    
    @GlobalConstant("CBErrorDomain")
    public static native String getClassDomain();

}
