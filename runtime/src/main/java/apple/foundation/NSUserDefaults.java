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





@Library("Foundation/Foundation.h") @Mapping("NSUserDefaults")
public class NSUserDefaults 
    extends NSObject 
     {

    
    
    public NSUserDefaults() {}
    
    
    @Mapping("volatileDomainNames")
    public native List<String> getVolatileDomainNames();
    
    
    
    @GlobalConstant("NSUserDefaultsDidChangeNotification")
    public static native NSString DidChangeNotification();
    
    @Mapping("objectForKey:")
    public native Object get(String defaultName);
    @Mapping("setObject:forKey:")
    public native void setObject(Object value, String defaultName);
    @Mapping("removeObjectForKey:")
    public native void remove(String defaultName);
    @Mapping("stringForKey:")
    public native String getString(String defaultName);
    @Mapping("arrayForKey:")
    public native NSArray<?> getArray(String defaultName);
    @Mapping("dictionaryForKey:")
    public native NSDictionary<?, ?> getDictionary(String defaultName);
    @Mapping("dataForKey:")
    public native NSData getData(String defaultName);
    @Mapping("stringArrayForKey:")
    public native List<String> getStringArray(String defaultName);
    @Mapping("integerForKey:")
    public native @MachineSizedSInt long getInteger(String defaultName);
    @Mapping("floatForKey:")
    public native float getFloat(String defaultName);
    @Mapping("doubleForKey:")
    public native double getDouble(String defaultName);
    @Mapping("boolForKey:")
    public native boolean getBoolean(String defaultName);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForKey:")
    public native NSURL getURL(String defaultName);
    @Mapping("setInteger:forKey:")
    public native void setInteger(@MachineSizedSInt long value, String defaultName);
    @Mapping("setFloat:forKey:")
    public native void setFloat(float value, String defaultName);
    @Mapping("setDouble:forKey:")
    public native void setDouble(double value, String defaultName);
    @Mapping("setBool:forKey:")
    public native void setBool(boolean value, String defaultName);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setURL:forKey:")
    public native void setURL(NSURL url, String defaultName);
    @Mapping("registerDefaults:")
    public native void registerDefaults(NSDictionary<?, ?> registrationDictionary);
    @Mapping("addSuiteNamed:")
    public native void addSuite(String suiteName);
    @Mapping("removeSuiteNamed:")
    public native void removeSuite(String suiteName);
    @Mapping("dictionaryRepresentation")
    public native NSDictionary<?, ?> asDictionary();
    @Mapping("volatileDomainForName:")
    public native NSDictionary<?, ?> getVolatileDomain(String domainName);
    @Mapping("setVolatileDomain:forName:")
    public native void setVolatileDomain(NSDictionary<?, ?> domain, String domainName);
    @Mapping("removeVolatileDomainForName:")
    public native void removeVolatileDomain(String domainName);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("persistentDomainNames")
    public native List<String> getPersistentDomainNames();
    @Mapping("persistentDomainForName:")
    public native NSDictionary<?, ?> getPersistentDomain(String domainName);
    @Mapping("setPersistentDomain:forName:")
    public native void setPersistentDomain(NSDictionary<?, ?> domain, String domainName);
    @Mapping("removePersistentDomainForName:")
    public native void removePersistentDomain(String domainName);
    @Mapping("synchronize")
    public native boolean synchronize();
    @Mapping("objectIsForcedForKey:")
    public native boolean isObjectForced(String key);
    @Mapping("objectIsForcedForKey:inDomain:")
    public native boolean isObjectForced(String key, String domain);
    @Mapping("standardUserDefaults")
    public static native NSUserDefaults getStandardUserDefaults();
    @Mapping("resetStandardUserDefaults")
    public static native void resetStandardUserDefaults();
    
}
