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





@Library("Foundation") @Mapping("NSXMLParser")
public class NSXMLParser 
    extends NSObject 
     {

    
    
    public NSXMLParser() {}
    @Mapping("initWithContentsOfURL:")
    public NSXMLParser(NSURL url) { }
    @Mapping("initWithData:")
    public NSXMLParser(NSData data) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithStream:")
    public NSXMLParser(NSInputStream stream) { }
    
    
    @Mapping("delegate")
    public native NSXMLParserDelegate getDelegate();
    public native void setDelegate(NSXMLParserDelegate v);
    @Mapping("shouldProcessNamespaces")
    public native boolean shouldProcessNamespaces();
    public native void setShouldProcessNamespaces(boolean v);
    @Mapping("shouldReportNamespacePrefixes")
    public native boolean shouldReportNamespacePrefixes();
    public native void setShouldReportNamespacePrefixes(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("externalEntityResolvingPolicy")
    public native @Representing("NSXMLParserExternalEntityResolvingPolicy") @MachineSizedUInt long getExternalEntityResolvingPolicy();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setExternalEntityResolvingPolicy(@Representing("NSXMLParserExternalEntityResolvingPolicy") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("allowedExternalEntityURLs")
    public native NSSet<NSURL> getAllowedExternalEntityURLs();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setAllowedExternalEntityURLs(NSSet<NSURL> v);
    @Mapping("parserError")
    public native NSError getParserError();
    @Mapping("shouldResolveExternalEntities")
    public native boolean shouldResolveExternalEntities();
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
