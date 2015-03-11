package apple.newsstandkit;


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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("NewsstandKit") @Mapping("NKLibrary")
public class NKLibrary 
    extends NSObject 
     {

    
    
    public NKLibrary() {}
    
    
    @Mapping("issues")
    public native NSArray<NKIssue> getIssues();
    @Mapping("downloadingAssets")
    public native NSArray<NKAssetDownload> getDownloadingAssets();
    @Mapping("setDownloadingAssets:")
    public native void setDownloadingAssets(NSArray<NKAssetDownload> v);
    @Mapping("currentlyReadingIssue")
    public native NKIssue getCurrentlyReadingIssue();
    @Mapping("setCurrentlyReadingIssue:")
    public native void setCurrentlyReadingIssue(NKIssue v);
    
    
    
    @Mapping("issueWithName:")
    public native NKIssue getIssue(String name);
    @Mapping("addIssueWithName:date:")
    public native NKIssue addIssue(String name, NSDate date);
    @Mapping("removeIssue:")
    public native void removeIssue(NKIssue issue);
    @Mapping("sharedLibrary")
    public static native NKLibrary getSharedLibrary();
    
}
