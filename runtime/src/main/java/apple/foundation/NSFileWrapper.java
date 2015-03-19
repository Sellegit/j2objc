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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSFileWrapper")
public class NSFileWrapper 
    extends NSObject 
    implements NSCoding {

    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithURL:options:error:")
    public NSFileWrapper(NSURL url, @Representing("NSFileWrapperReadingOptions") long options, Todo outError) { }
    @Mapping("initDirectoryWithFileWrappers:")
    public NSFileWrapper(NSDictionary<?, ?> childrenByPreferredName) { }
    @Mapping("initRegularFileWithContents:")
    public NSFileWrapper(NSData contents) { }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initSymbolicLinkWithDestinationURL:")
    public NSFileWrapper(NSURL url) { }
    @Mapping("initWithCoder:")
    public NSFileWrapper(NSCoder inCoder) { }
    @Mapping("init")
    public NSFileWrapper() { }
    
    
    @Mapping("isDirectory")
    public native boolean isDirectory();
    @Mapping("isRegularFile")
    public native boolean isRegularFile();
    @Mapping("isSymbolicLink")
    public native boolean isSymbolicLink();
    @Mapping("preferredFilename")
    public native String getPreferredFilename();
    @Mapping("setPreferredFilename:")
    public native void setPreferredFilename(String v);
    @Mapping("filename")
    public native String getFilename();
    @Mapping("setFilename:")
    public native void setFilename(String v);
    @Mapping("fileAttributes")
    public native NSDictionary<?, ?> getFileAttributes();
    @Mapping("setFileAttributes:")
    public native void setFileAttributes(NSDictionary<?, ?> v);
    @Mapping("serializedRepresentation")
    public native NSData getSerializedRepresentation();
    @Mapping("fileWrappers")
    public native Map<String, NSFileWrapper> getFileWrappers();
    @Mapping("regularFileContents")
    public native NSData getRegularFileContents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("symbolicLinkDestinationURL")
    public native NSURL getSymbolicLinkDestinationURL();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("matchesContentsOfURL:")
    public native boolean matchesContentsOfURL(NSURL url);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("readFromURL:options:error:")
    public native boolean readFromURL(NSURL url, @Representing("NSFileWrapperReadingOptions") long options, Todo outError);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("writeToURL:options:originalContentsURL:error:")
    public native boolean writeToURL(NSURL url, @Representing("NSFileWrapperWritingOptions") long options, NSURL originalContentsURL, Todo outError);
    @Mapping("addFileWrapper:")
    public native String addFileWrapper(NSFileWrapper child);
    @Mapping("addRegularFileWithContents:preferredFilename:")
    public native String addRegularFile(NSData data, String fileName);
    @Mapping("removeFileWrapper:")
    public native void removeFileWrapper(NSFileWrapper child);
    @Mapping("keyForFileWrapper:")
    public native String getKeyForFileWrapper(NSFileWrapper child);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
