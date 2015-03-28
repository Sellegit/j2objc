package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h") @Mapping("NSKeyedUnarchiverDelegate")
public interface NSKeyedUnarchiverDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("unarchiver:didDecodeObject:")
    Object didDecodeObject(NSKeyedUnarchiver unarchiver, Object object);
    @Mapping("unarchiver:willReplaceObject:withObject:")
    void willReplaceObject(NSKeyedUnarchiver unarchiver, Object object, Object newObject);
    @Mapping("unarchiverWillFinish:")
    void willFinish(NSKeyedUnarchiver unarchiver);
    @Mapping("unarchiverDidFinish:")
    void didFinish(NSKeyedUnarchiver unarchiver);

    /*<adapter>*/
    /*</adapter>*/
}
