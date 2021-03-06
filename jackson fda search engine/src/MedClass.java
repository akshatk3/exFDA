//class constructed out of the fda approved medicinal label
public class MedClass {
	String effective_time;
	String[] purpose;
	String[] purpose_table;
	String[] keep_out_of_reach_of_children;
	String[] questions;
	String[] pregnancy_or_breast_feeding;
	String[] storage_and_handling;
	String[] indications_and_usage;
	String set_id;
	String id;
	String[] ask_doctor_or_pharmacist;
	String[] active_ingredient;
	String[] active_ingredient_table;
	String[] dosage_and_administration_table;
	String[] inactive_ingredient;
	String[] inactive_ingredient_table;
	String[] warnings;
	String[] spl_product_data_elements;
	String[] spl_product_data_elements_table;
	String[] ask_doctor;
	Openfda openfda;
	String version;
	String[] dosage_and_administration;
	String[] spl_unclassified_section;
	String[] stop_use;
	String[] do_not_use;
	String[] package_label_principal_display_panel;
	String[] abuse;
	String[] abuse_table;
	String[] accessories;
	String[] accessories_table;
	String[] adverse_reactions;
	String[] adverse_reactions_table;
	String[] alarms;
	String[] alarms_table;
	String[] controlled_substance;
	String[] controlled_substance_table;
	String[] dependence;
	String[] dependence_table;
	String[] drug_abuse_and_dependence;
	String[] drug_abuse_and_dependence_table;
	String[] overdosage;
	String[] overdosage_table;
	String[] drug_and_or_laboratory_test_interactions;
	String[] drug_and_or_laboratory_test_interactions_table;
	String[] drug_interactions;
	String[] drug_interactions_table;
	String[] clinical_pharmacology;
	String[] clinical_pharmacology_table;
	String[] mechanism_of_action;
	String[] mechanism_of_action_table;
	String[] pharmacodynamics;
	String[] pharmacodynamics_table;
	String[] pharmacokinetics;
	String[] pharmacokinetics_table;
	String[] contraindications;
	String[] contraindications_table;
	String[] description;
	String[] description_table;
	String[] dosage_forms_and_strengths;
	String[] dosage_forms_and_strengths_table;
	String[] indications_and_usage_table;
	String[] animal_pharmacology_and_or_toxicology;
	String[] animal_pharmacology_and_or_toxicology_table;
	String[] carcinogenesis_and_mutagenesis_and_impairment;
	String[] carcinogenesis_and_mutagenesis_and_impairment_table;
	String[] nonclinical_toxicology;
	String[] nonclinical_toxicology_table;
	public String getEffective_time() {
		return effective_time;
	}
	public void setEffective_time(String effective_time) {
		this.effective_time = effective_time;
	}
	public String[] getPurpose() {
		return purpose;
	}
	public void setPurpose(String[] purpose) {
		this.purpose = purpose;
	}
	public String[] getKeep_out_of_reach_of_children() {
		return keep_out_of_reach_of_children;
	}
	public void setKeep_out_of_reach_of_children(String[] keep_out_of_reach_of_children) {
		this.keep_out_of_reach_of_children = keep_out_of_reach_of_children;
	}
	public String[] getQuestions() {
		return questions;
	}
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	public String[] getPregnancy_or_breast_feeding() {
		return pregnancy_or_breast_feeding;
	}
	public void setPregnancy_or_breast_feeding(String[] pregnancy_or_breast_feeding) {
		this.pregnancy_or_breast_feeding = pregnancy_or_breast_feeding;
	}
	public String[] getStorage_and_handling() {
		return storage_and_handling;
	}
	public void setStorage_and_handling(String[] storage_and_handling) {
		this.storage_and_handling = storage_and_handling;
	}
	public String[] getIndications_and_usage() {
		return indications_and_usage;
	}
	public void setIndications_and_usage(String[] indications_and_usage) {
		this.indications_and_usage = indications_and_usage;
	}
	public String getSet_id() {
		return set_id;
	}
	public void setSet_id(String set_id) {
		this.set_id = set_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getAsk_doctor_or_pharmacist() {
		return ask_doctor_or_pharmacist;
	}
	public void setAsk_doctor_or_pharmacist(String[] ask_doctor_or_pharmacist) {
		this.ask_doctor_or_pharmacist = ask_doctor_or_pharmacist;
	}
	public String[] getActive_ingredient() {
		return active_ingredient;
	}
	public void setActive_ingredient(String[] active_ingredient) {
		this.active_ingredient = active_ingredient;
	}
	public String[] getDosage_and_administration_table() {
		return dosage_and_administration_table;
	}
	public void setDosage_and_administration_table(String[] dosage_and_administration_table) {
		this.dosage_and_administration_table = dosage_and_administration_table;
	}
	public String[] getInactive_ingredient() {
		return inactive_ingredient;
	}
	public void setInactive_ingredient(String[] inactive_ingredient) {
		this.inactive_ingredient = inactive_ingredient;
	}
	public String[] getWarnings() {
		return warnings;
	}
	public void setWarnings(String[] warnings) {
		this.warnings = warnings;
	}
	public String[] getSpl_product_data_elements() {
		return spl_product_data_elements;
	}
	public void setSpl_product_data_elements(String[] spl_product_data_elements) {
		this.spl_product_data_elements = spl_product_data_elements;
	}
	public String[] getAsk_doctor() {
		return ask_doctor;
	}
	public void setAsk_doctor(String[] ask_doctor) {
		this.ask_doctor = ask_doctor;
	}
	public Openfda getOpenfda() {
		return openfda;
	}
	public void setOpenfda(Openfda openfda) {
		this.openfda = openfda;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String[] getDosage_and_administration() {
		return dosage_and_administration;
	}
	public void setDosage_and_administration(String[] dosage_and_administration) {
		this.dosage_and_administration = dosage_and_administration;
	}
	public String[] getSpl_unclassified_section() {
		return spl_unclassified_section;
	}
	public void setSpl_unclassified_section(String[] spl_unclassified_section) {
		this.spl_unclassified_section = spl_unclassified_section;
	}
	public String[] getStop_use() {
		return stop_use;
	}
	public void setStop_use(String[] stop_use) {
		this.stop_use = stop_use;
	}
	public String[] getDo_not_use() {
		return do_not_use;
	}
	public void setDo_not_use(String[] do_not_use) {
		this.do_not_use = do_not_use;
	}
	public String[] getPackage_label_principal_display_panel() {
		return package_label_principal_display_panel;
	}
	public void setPackage_label_principal_display_panel(String[] package_label_principal_display_panel) {
		this.package_label_principal_display_panel = package_label_principal_display_panel;
	}
	
	
}
