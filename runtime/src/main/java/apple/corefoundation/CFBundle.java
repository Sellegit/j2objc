package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation")
public class CFBundle 
    extends CFType 
     {

    
    
    protected CFBundle() {}
    
    
    
    
    @GlobalFunction("CFBundleGetMainBundle")
    public static native CFBundle getMainBundle();
    @GlobalFunction("CFBundleGetBundleWithIdentifier")
    public static native CFBundle getBundleWithIdentifier(String bundleID);
    @GlobalFunction("CFBundleGetAllBundles")
    public static native CFArray getAllBundles();
    @GlobalFunction("CFBundleGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFBundleCreate")
    public static native CFBundle create(CFAllocator allocator, CFURL bundleURL);
    @GlobalFunction("CFBundleCreateBundlesFromDirectory")
    public static native CFArray createBundlesFromDirectory(CFAllocator allocator, CFURL directoryURL, String bundleType);
    @GlobalFunction("CFBundleCopyBundleURL")
    public native CFURL copyBundleURL();
    @GlobalFunction("CFBundleGetValueForInfoDictionaryKey")
    public native CFType getValueForInfoDictionaryKey(String key);
    @GlobalFunction("CFBundleGetInfoDictionary")
    public native CFDictionary getInfoDictionary();
    @GlobalFunction("CFBundleGetLocalInfoDictionary")
    public native CFDictionary getLocalInfoDictionary();
    @GlobalFunction("CFBundleGetPackageInfo")
    public native void getPackageInfo(Todo packageType, Todo packageCreator);
    @GlobalFunction("CFBundleGetIdentifier")
    public native String getIdentifier();
    @GlobalFunction("CFBundleGetVersionNumber")
    public native int getVersionNumber();
    @GlobalFunction("CFBundleGetDevelopmentRegion")
    public native String getDevelopmentRegion();
    @GlobalFunction("CFBundleCopySupportFilesDirectoryURL")
    public native CFURL copySupportFilesDirectoryURL();
    @GlobalFunction("CFBundleCopyResourcesDirectoryURL")
    public native CFURL copyResourcesDirectoryURL();
    @GlobalFunction("CFBundleCopyPrivateFrameworksURL")
    public native CFURL copyPrivateFrameworksURL();
    @GlobalFunction("CFBundleCopySharedFrameworksURL")
    public native CFURL copySharedFrameworksURL();
    @GlobalFunction("CFBundleCopySharedSupportURL")
    public native CFURL copySharedSupportURL();
    @GlobalFunction("CFBundleCopyBuiltInPlugInsURL")
    public native CFURL copyBuiltInPlugInsURL();
    @GlobalFunction("CFBundleCopyInfoDictionaryInDirectory")
    public static native CFDictionary copyInfoDictionaryInDirectory(CFURL bundleURL);
    @GlobalFunction("CFBundleGetPackageInfoInDirectory")
    public static native boolean getPackageInfoInDirectory(CFURL url, Todo packageType, Todo packageCreator);
    @GlobalFunction("CFBundleCopyResourceURL")
    public native CFURL copyResourceURL(String resourceName, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyResourceURLsOfType")
    public native CFArray copyResourceURLsOfType(String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyLocalizedString")
    public native String copyLocalizedString(String key, String value, String tableName);
    @GlobalFunction("CFBundleCopyResourceURLInDirectory")
    public static native CFURL copyResourceURLInDirectory(CFURL bundleURL, String resourceName, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyResourceURLsOfTypeInDirectory")
    public static native CFArray copyResourceURLsOfTypeInDirectory(CFURL bundleURL, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyBundleLocalizations")
    public native CFArray copyBundleLocalizations();
    @GlobalFunction("CFBundleCopyPreferredLocalizationsFromArray")
    public static native CFArray copyPreferredLocalizationsFromArray(CFArray locArray);
    @GlobalFunction("CFBundleCopyLocalizationsForPreferences")
    public static native CFArray copyLocalizationsForPreferences(CFArray locArray, CFArray prefArray);
    @GlobalFunction("CFBundleCopyResourceURLForLocalization")
    public native CFURL copyResourceURLForLocalization(String resourceName, String resourceType, String subDirName, String localizationName);
    @GlobalFunction("CFBundleCopyResourceURLsOfTypeForLocalization")
    public native CFArray copyResourceURLsOfTypeForLocalization(String resourceType, String subDirName, String localizationName);
    @GlobalFunction("CFBundleCopyInfoDictionaryForURL")
    public static native CFDictionary copyInfoDictionaryForURL(CFURL url);
    @GlobalFunction("CFBundleCopyLocalizationsForURL")
    public static native CFArray copyLocalizationsForURL(CFURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundleCopyExecutableArchitecturesForURL")
    public static native CFArray copyExecutableArchitecturesForURL(CFURL url);
    @GlobalFunction("CFBundleCopyExecutableURL")
    public native CFURL copyExecutableURL();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundleCopyExecutableArchitectures")
    public native CFArray copyExecutableArchitectures();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundlePreflightExecutable")
    public native boolean preflightExecutable(Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundleLoadExecutableAndReturnError")
    public native boolean loadExecutableAndReturnError(Todo error);
    @GlobalFunction("CFBundleLoadExecutable")
    public native boolean loadExecutable();
    @GlobalFunction("CFBundleIsExecutableLoaded")
    public native boolean isExecutableLoaded();
    @GlobalFunction("CFBundleUnloadExecutable")
    public native void unloadExecutable();
    @GlobalFunction("CFBundleGetFunctionPointerForName")
    public native Todo getFunctionPointerForName(String functionName);
    @GlobalFunction("CFBundleGetFunctionPointersForNames")
    public native void getFunctionPointersForNames(CFArray functionNames, Todo ftbl);
    @GlobalFunction("CFBundleGetDataPointerForName")
    public native Todo getDataPointerForName(String symbolName);
    @GlobalFunction("CFBundleGetDataPointersForNames")
    public native void getDataPointersForNames(CFArray symbolNames, Todo stbl);
    @GlobalFunction("CFBundleCopyAuxiliaryExecutableURL")
    public native CFURL copyAuxiliaryExecutableURL(String executableName);
    @GlobalFunction("CFBundleGetPlugIn")
    public native CFPlugIn getPlugIn();
    @GlobalFunction("CFBundleOpenBundleResourceMap")
    public native short openBundleResourceMap();
    @GlobalFunction("CFBundleOpenBundleResourceFiles")
    public native int openBundleResourceFiles(Todo refNum, Todo localizedRefNum);
    @GlobalFunction("CFBundleCloseBundleResourceMap")
    public native void closeBundleResourceMap(short refNum);
    
}
