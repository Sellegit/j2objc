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


@Library("Foundation/Foundation.h") @Mapping("NSKeyedArchiverDelegate")
public interface NSKeyedArchiverDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("archiver:willEncodeObject:")
    Object willEncodeObject(NSKeyedArchiver archiver, Object object);
    @Mapping("archiver:didEncodeObject:")
    void didEncodeObject(NSKeyedArchiver archiver, Object object);
    @Mapping("archiver:willReplaceObject:withObject:")
    void willReplaceObject(NSKeyedArchiver archiver, Object object, Object newObject);
    @Mapping("archiverWillFinish:")
    void willFinish(NSKeyedArchiver archiver);
    @Mapping("archiverDidFinish:")
    void didFinish(NSKeyedArchiver archiver);

    /*<adapter>*/
    /*</adapter>*/
}
