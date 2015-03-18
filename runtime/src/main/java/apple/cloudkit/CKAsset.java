package apple.cloudkit;


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
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CloudKit/CloudKit.h") @Mapping("CKAsset")
public class CKAsset 
    extends NSObject 
    implements CKRecordValue {

    
    
    @Mapping("initWithFileURL:")
    public CKAsset(NSURL fileURL) { }
    @Mapping("init")
    public CKAsset() { }
    
    
    @Mapping("fileURL")
    public native NSURL getFileURL();
    
    
    
    
    
}
