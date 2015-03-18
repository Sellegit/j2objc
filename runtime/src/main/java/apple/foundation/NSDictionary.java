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





@Library("Foundation/Foundation.h") @Mapping("NSDictionary")
public class NSDictionary <K, V>
    extends NSObject 
    implements NSPropertyList, NSFastEnumeration {

    
    
    public NSDictionary() {}
    @Mapping("initWithDictionary:")
    public NSDictionary(NSDictionary<?, ?> otherDictionary) { }
    @Mapping("initWithObjects:forKeys:")
    public NSDictionary(NSArray<?> objects, NSArray<?> keys) { }
    
    
    @Mapping("count")
    public native @MachineSizedUInt long getCount();
    @Mapping("allKeys")
    public native NSArray<K> getAllKeys();
    @Mapping("allValues")
    public native NSArray<V> getAllValues();
    @Mapping("descriptionInStringsFileFormat")
    public native String toFileFormatString();
    
    
    
    @Mapping("objectForKey:")
    public native V getObject(Object aKey);
    @Mapping("isEqualToDictionary:")
    public native boolean equalsTo(NSDictionary<?, ?> otherDictionary);
    @Mapping("writeToFile:atomically:")
    public native boolean writeFile(String path, boolean useAuxiliaryFile);
    @Mapping("writeToURL:atomically:")
    public native boolean write(NSURL url, boolean atomically);
    @Mapping("dictionaryWithContentsOfFile:")
    public static native NSDictionary<?, ?> read(String path);
    @Mapping("dictionaryWithContentsOfURL:")
    public static native NSDictionary<?, ?> read(NSURL url);
    
}
