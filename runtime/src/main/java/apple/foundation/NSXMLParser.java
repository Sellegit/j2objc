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





@Library("Foundation/Foundation.h") @Mapping("NSXMLParser")
public class NSXMLParser 
    extends NSObject 
     {

    
    
    @Mapping("initWithContentsOfURL:")
    public NSXMLParser(NSURL url) { }
    @Mapping("initWithData:")
    public NSXMLParser(NSData data) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithStream:")
    public NSXMLParser(NSInputStream stream) { }
    @Mapping("init")
    public NSXMLParser() { }
    
    
    @Mapping("delegate")
    public native NSXMLParserDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSXMLParserDelegate v);
    @Mapping("shouldProcessNamespaces")
    public native boolean shouldProcessNamespaces();
    @Mapping("setShouldProcessNamespaces:")
    public native void setShouldProcessNamespaces(boolean v);
    @Mapping("shouldReportNamespacePrefixes")
    public native boolean shouldReportNamespacePrefixes();
    @Mapping("setShouldReportNamespacePrefixes:")
    public native void setShouldReportNamespacePrefixes(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("externalEntityResolvingPolicy")
    public native @Representing("NSXMLParserExternalEntityResolvingPolicy") long getExternalEntityResolvingPolicy();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setExternalEntityResolvingPolicy:")
    public native void setExternalEntityResolvingPolicy(@Representing("NSXMLParserExternalEntityResolvingPolicy") long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("allowedExternalEntityURLs")
    public native NSSet<NSURL> getAllowedExternalEntityURLs();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAllowedExternalEntityURLs:")
    public native void setAllowedExternalEntityURLs(NSSet<NSURL> v);
    @Mapping("parserError")
    public native NSError getParserError();
    @Mapping("shouldResolveExternalEntities")
    public native boolean shouldResolveExternalEntities();
    @Mapping("setShouldResolveExternalEntities:")
    public native void setShouldResolveExternalEntities(boolean v);
    @Mapping("publicID")
    public native String getPublicID();
    @Mapping("systemID")
    public native String getSystemID();
    @Mapping("lineNumber")
    public native @MachineSizedSInt long getLineNumber();
    @Mapping("columnNumber")
    public native @MachineSizedSInt long getColumnNumber();
    
    
    
    @Mapping("parse")
    public native boolean parse();
    @Mapping("abortParsing")
    public native void abortParsing();
    
}
