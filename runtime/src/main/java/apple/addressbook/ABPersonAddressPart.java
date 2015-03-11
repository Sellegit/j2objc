package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook")
public class ABPersonAddressPart 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonAddressStreetKey")
    protected static native CFString StreetValue();
    @GlobalConstant("kABPersonAddressCityKey")
    protected static native CFString CityValue();
    @GlobalConstant("kABPersonAddressStateKey")
    protected static native CFString StateValue();
    @GlobalConstant("kABPersonAddressZIPKey")
    protected static native CFString ZIPValue();
    @GlobalConstant("kABPersonAddressCountryKey")
    protected static native CFString CountryValue();
    @GlobalConstant("kABPersonAddressCountryCodeKey")
    protected static native CFString CountryCodeValue();
    
}
