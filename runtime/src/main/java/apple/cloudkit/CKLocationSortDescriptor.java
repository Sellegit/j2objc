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

@Library("CloudKit/CloudKit.h") @Mapping("CKLocationSortDescriptor")
public class CKLocationSortDescriptor 
    extends NSSortDescriptor 
     {

    
    
    public CKLocationSortDescriptor() {}
    @Mapping("initWithKey:relativeLocation:")
    public CKLocationSortDescriptor(String key, CLLocation relativeLocation) { }
    @Mapping("initWithCoder:")
    public CKLocationSortDescriptor(NSCoder aDecoder) { }
    @Mapping("initWithKey:ascending:")
    public CKLocationSortDescriptor(String key, boolean ascending) { }
    @Mapping("initWithKey:ascending:selector:")
    public CKLocationSortDescriptor(String key, boolean ascending, Selector selector) { }
    
    
    @Mapping("relativeLocation")
    public native CLLocation getRelativeLocation();
    
    
    
    
    
}
