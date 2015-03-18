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





@Library("Foundation/Foundation.h") @Mapping("NSBundle")
public class NSBundle 
    extends NSObject 
     {

    
    
    public NSBundle() {}
    @Mapping("initWithPath:")
    public NSBundle(String path) { }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithURL:")
    public NSBundle(NSURL url) { }
    
    
    @Mapping("isLoaded")
    public native boolean isLoaded();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("bundleURL")
    public native NSURL getBundleURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("resourceURL")
    public native NSURL getResourceURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("executableURL")
    public native NSURL getExecutableURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("privateFrameworksURL")
    public native NSURL getPrivateFrameworksURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("sharedFrameworksURL")
    public native NSURL getSharedFrameworksURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("sharedSupportURL")
    public native NSURL getSharedSupportURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("builtInPlugInsURL")
    public native NSURL getBuiltInPlugInsURL();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("appStoreReceiptURL")
    public native NSURL getAppStoreReceiptURL();
    @Mapping("bundlePath")
    public native String getBundlePath();
    @Mapping("resourcePath")
    public native String getResourcePath();
    @Mapping("executablePath")
    public native String getExecutablePath();
    @Mapping("privateFrameworksPath")
    public native String getPrivateFrameworksPath();
    @Mapping("sharedFrameworksPath")
    public native String getSharedFrameworksPath();
    @Mapping("sharedSupportPath")
    public native String getSharedSupportPath();
    @Mapping("builtInPlugInsPath")
    public native String getBuiltInPlugInsPath();
    @Mapping("bundleIdentifier")
    public native String getBundleIdentifier();
    @Mapping("infoDictionary")
    public native NSDictionary<?, ?> getInfoDictionary();
    @Mapping("localizedInfoDictionary")
    public native NSDictionary<?, ?> getLocalizedInfoDictionary();
    @Mapping("preferredLocalizations")
    public native List<String> getPreferredLocalizations();
    @Mapping("localizations")
    public native List<String> getLocalizations();
    @Mapping("developmentLocalization")
    public native String getDevelopmentLocalization();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("executableArchitectures")
    public native List<NSBundleExecutableArchitectureType> getExecutableArchitectures();
    
    
    
    @GlobalConstant("NSBundleDidLoadNotification")
    public static native NSString DidLoadNotification();
    @GlobalConstant("NSLoadedClasses")
    public static native NSString LoadedClassesKey();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("preflightAndReturnError:")
    public native boolean preflight(Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("loadAndReturnError:")
    public native boolean load(Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForAuxiliaryExecutable:")
    public native NSURL findAuxiliaryExecutableURL(String executableName);
    @Mapping("pathForAuxiliaryExecutable:")
    public native String findAuxiliaryExecutablePath(String executableName);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForResource:withExtension:")
    public native NSURL findResourceURLInSubPath(String name, String ext);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForResource:withExtension:subdirectory:")
    public native NSURL findResourceURLInSubPath(String name, String ext, String subpath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForResource:withExtension:subdirectory:localization:")
    public native NSURL findResourceURLInSubPath(String name, String ext, String subpath, String localizationName);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLsForResourcesWithExtension:subdirectory:")
    public native NSArray<NSURL> findResourceURLsInSubPath(String ext, String subpath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLsForResourcesWithExtension:subdirectory:localization:")
    public native NSArray<NSURL> findResourceURLsInSubPath(String ext, String subpath, String localizationName);
    @Mapping("pathForResource:ofType:")
    public native String findResourcePath(String name, String ext);
    @Mapping("pathForResource:ofType:inDirectory:")
    public native String findResourcePathInSubPath(String name, String ext, String subpath);
    @Mapping("pathForResource:ofType:inDirectory:forLocalization:")
    public native String findResourcePathInSubPath(String name, String ext, String subpath, String localizationName);
    @Mapping("pathsForResourcesOfType:inDirectory:")
    public native List<String> findResourcesPathsInSubPath(String ext, String subpath);
    @Mapping("pathsForResourcesOfType:inDirectory:forLocalization:")
    public native List<String> findResourcesPathsInSubPath(String ext, String subpath, String localizationName);
    @Mapping("localizedStringForKey:value:table:")
    public native String getLocalizedString(String key, String value, String tableName);
    @Mapping("objectForInfoDictionaryKey:")
    public native Object getInfoDictionaryObject(String key);
    @Mapping("mainBundle")
    public static native NSBundle getMainBundle();
    @Mapping("bundleWithIdentifier:")
    public static native NSBundle getBundle(String identifier);
    @Mapping("allBundles")
    public static native NSArray<NSBundle> getAllBundles();
    @Mapping("allFrameworks")
    public static native NSArray<NSBundle> getAllFrameworks();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForResource:withExtension:subdirectory:inBundleWithURL:")
    public static native NSURL findResourceURLInBundleURL(String name, String ext, String subpath, NSURL bundleURL);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLsForResourcesWithExtension:subdirectory:inBundleWithURL:")
    public static native List<String> findResourceURLsInBundleURL(String ext, String subpath, NSURL bundleURL);
    @Mapping("pathForResource:ofType:inDirectory:")
    public static native String findResourcePathInBundlePath(String name, String ext, String bundlePath);
    @Mapping("pathsForResourcesOfType:inDirectory:")
    public static native List<String> findResourcesPathsInBundlePath(String ext, String bundlePath);
    @Mapping("preferredLocalizationsFromArray:")
    public static native List<String> getPreferredLocalizations(NSArray<?> localizationsArray);
    @Mapping("preferredLocalizationsFromArray:forPreferences:")
    public static native List<String> getPreferredLocalizations(NSArray<?> localizationsArray, NSArray<?> preferencesArray);
    
}
