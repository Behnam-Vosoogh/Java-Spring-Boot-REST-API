package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Behnamvosoogh.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	@GetMapping("{vendorid}")
	public CloudVendor getCloudVendorDetails(String vendorId)
	{
		return new CloudVendor("C1","Vendor","Address 1","xxxxxxxxxx");
		
	}

}
