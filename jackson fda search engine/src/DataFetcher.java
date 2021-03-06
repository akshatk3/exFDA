import com.fasterxml.jackson.*;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class DataFetcher {
	
	static String[] searchable_fields = {"abuse", "abuse_table", "accessories", "accessories_table", "active_ingredient", "active_ingredient_table", "adverse_reactions", "adverse_reactions_table", "alarms", "alarms_table", "controlled_substance", "controlled_substance_table", "dependence", "dependence_table", "drug_abuse_and_dependence", "drug_abuse_and_dependence_table", "overdosage", "overdosage_table", "drug_and_or_laboratory_test_interactions", "drug_and_or_laboratory_test_interactions_table", "drug_interactions", "drug_interactions_table", "clinical_pharmacology", "clinical_pharmacology_table", "mechanism_of_action", "mechanism_of_action_table", "pharmacodynamics", "pharmacodynamics_table", "pharmacokinetics", "pharmacokinetics_table", "effective_time", "effective_time_table", "id", "set_id", "version", "contraindications", "contraindications_table", "description", "description_table", "dosage_and_administration", "dosage_and_administration_table", "dosage_forms_and_strengths", "dosage_forms_and_strengths_table", "inactive_ingredient", "inactive_ingredient_table", "indications_and_usage", "indications_and_usage_table", "purpose", "purpose_table", "spl_product_data_elements", "spl_product_data_elements_table", "animal_pharmacology_and_or_toxicology", "animal_pharmacology_and_or_toxicology_table", "carcinogenesis_and_mutagenesis_and_impairment", "carcinogenesis_and_mutagenesis_and_impairment_table", "nonclinical_toxicology", "nonclinical_toxicology_table", "openfda.application_number", "openfda.brand_name", "openfda.generic_name", "openfda.manufacturer_name", "openfda.nui", "openfda.package_ndc", "openfda.pharm_class_cs", "openfda.pharm_class_epc", "openfda.pharm_class_moa", "openfda.pharm_class_pe", "openfda.product_ndc", "openfda.product_type", "openfda.route", "openfda.rxcui", "openfda.spl_id", "openfda.spl_set_id", "openfda.substance_name", "openfda.unii", "openfda.upc", "laboratory_tests", "laboratory_tests_table", "microbiology", "microbiology_table", "package_label_principal_display_panel", "package_label_principal_display_panel_table", "recent_major_changes", "recent_major_changes_table", "spl_unclassified_section", "spl_unclassified_section_table", "ask_doctor", "ask_doctor_or_pharmacist", "ask_doctor_or_pharmacist_table", "ask_doctor_table", "do_not_use", "do_not_use_table", "information_for_owners_or_caregivers", "information_for_owners_or_caregivers_table", "information_for_patients", "information_for_patients_table", "instructions_for_use", "instructions_for_use_table", "keep_out_of_reach_of_children", "keep_out_of_reach_of_children_table", "other_safety_information", "other_safety_information_table", "patient_medication_information", "patient_medication_information_table", "questions", "questions_table", "spl_medguide", "spl_medguide_table", "spl_patient_package_insert", "spl_patient_package_insert_table", "stop_use", "stop_use_table", "when_using", "when_using_table", "clinical_studies", "clinical_studies_table", "references", "references_table", "geriatric_use", "geriatric_use_table", "labor_and_delivery", "labor_and_delivery_table", "nursing_mothers", "nursing_mothers_table", "pediatric_use", "pediatric_use_table", "pregnancy", "pregnancy_or_breast_feeding", "pregnancy_or_breast_feeding_table", "pregnancy_table", "teratogenic_effects", "teratogenic_effects_table", "use_in_specific_populations", "use_in_specific_populations_table", "how_supplied", "how_supplied_table", "safe_handling_warning", "safe_handling_warning_table", "storage_and_handling", "storage_and_handling_table", "boxed_warning", "boxed_warning_table", "general_precautions", "general_precautions_table", "precautions", "precautions_table", "user_safety_warnings", "user_safety_warnings_table", "warnings", "warnings_table" };

	public static void main(String[] args) {
		
		
		Results result;
		
		System.out.println("Searchable Fields");
		System.out.println(":::::::::::::");
		int z = 0;
		while (z < searchable_fields.length) {
			System.out.println(searchable_fields[z]);
			z++;
		}
		
		System.out.println();
		ObjectMapper mapper = new ObjectMapper();
		String surl = "https://api.fda.gov/drug/label.json?search=";
		
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		URL url;
		
		
		
		//asks for search field and search input
	
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter search field: ");
		String field = scanner.nextLine();
		
		System.out.println("What would you like to search for?");
		String SI = "'" + scanner.nextLine() + "'";
	
		System.out.println("How many results?");
		String num =  scanner.nextLine();
		
		String limit = "&limit=" + num;
		
		surl = surl + field + ":" + SI + limit;
		System.out.println(surl);

		try {
			url = new URL(surl);
			URLConnection request = url.openConnection();
		    request.connect();
		    result = mapper.readValue(url, Results.class);
		    
		    for (int i = 0; i < Integer.parseInt(num); i++) {
		    	try {
		    		System.out.println(result.getResults().get(i).getOpenfda().getBrand_name()[0]);
		    	} catch (NullPointerException e) {
		    		System.out.println("Requested info does not exist in particular field!");
		    	}
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid URL! Please refer to the searchable fields for valid database perusing.");
		}
		
		
		/*
		try {
			result = mapper.readValue(jsonExample, Results.class);
			System.out.println(result.getResults().get(0).getId());
		} catch (IOException e)s {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		
	}
	

}
