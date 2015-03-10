package apple.coredata;


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
@Library("CoreData")
public class NSPersistentStoreType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLiteStoreType")
    protected static native String SQLiteValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSBinaryStoreType")
    protected static native String BinaryValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInMemoryStoreType")
    protected static native String InMemoryValue();
    
}
