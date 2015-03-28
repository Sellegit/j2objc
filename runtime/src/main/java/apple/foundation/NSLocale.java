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


@Library("Foundation/Foundation.h") @Mapping("NSLocale")
public class NSLocale 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithLocaleIdentifier:")
    public NSLocale(String string) { }
    @Mapping("init")
    public NSLocale() { }

    
    @Mapping("localeIdentifier")
    public native String getLocaleIdentifier();

    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSCurrentLocaleDidChangeNotification")
    public static native NSString CurrentLocaleDidChangeNotification();

    @Mapping("objectForKey:")
    public native Object getComponent(Object key);
    @Mapping("displayNameForKey:value:")
    public native String getComponentDisplayName(Object key, Object value);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("autoupdatingCurrentLocale")
    public static native NSLocale getAutoupdatingCurrentLocale();
    @Mapping("currentLocale")
    public static native NSLocale getCurrentLocale();
    @Mapping("systemLocale")
    public static native NSLocale getSystemLocale();
    @Mapping("availableLocaleIdentifiers")
    public static native List<String> getAvailableLocaleIdentifiers();
    @Mapping("ISOLanguageCodes")
    public static native List<String> getISOLanguageCodes();
    @Mapping("ISOCountryCodes")
    public static native List<String> getISOCountryCodes();
    @Mapping("ISOCurrencyCodes")
    public static native List<String> getISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("commonISOCurrencyCodes")
    public static native List<String> getCommonISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("preferredLanguages")
    public static native List<String> getPreferredLanguages();
    @Mapping("componentsFromLocaleIdentifier:")
    public static native Map<NSLocaleComponent, NSObject> getComponentsFromLocaleIdentifier(String string);
    @Mapping("localeIdentifierFromComponents:")
    public static native String getLocaleIdentifierFromComponents(NSDictionary<?, ?> dict);
    @Mapping("canonicalLocaleIdentifierFromString:")
    public static native String getCanonicalLocaleIdentifier(String string);
    @Mapping("canonicalLanguageIdentifierFromString:")
    public static native String getCanonicalLanguageIdentifier(String string);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("localeIdentifierFromWindowsLocaleCode:")
    public static native String getLocaleIdentifierFromWindowsLocaleCode(int lcid);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("windowsLocaleCodeFromLocaleIdentifier:")
    public static native int getWindowsLocaleCodeFromLocaleIdentifier(String localeIdentifier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("characterDirectionForLanguage:")
    public static native @Representing("NSLocaleLanguageDirection") long getCharacterDirection(String isoLangCode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("lineDirectionForLanguage:")
    public static native @Representing("NSLocaleLanguageDirection") long getLineDirection(String isoLangCode);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
