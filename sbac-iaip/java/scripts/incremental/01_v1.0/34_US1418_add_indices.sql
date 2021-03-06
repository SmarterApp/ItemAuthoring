ALTER TABLE content_asset_pair ADD INDEX (cap_asset_name);
ALTER TABLE deleted_passage ADD INDEX (p_id);
ALTER TABLE deleted_passage ADD INDEX (ib_id);
ALTER TABLE hierarchy_definition ADD INDEX (hd_parent_path);
ALTER TABLE item ADD INDEX (i_is_old_version);
ALTER TABLE item ADD INDEX (i_ims_id);
ALTER TABLE item_asset_attribute ADD INDEX (iaa_filename);
ALTER TABLE item_asset_attribute ADD INDEX (iaa_timestamp);
ALTER TABLE item_bank_metafiles ADD INDEX (ibm_timestamp);
ALTER TABLE item_metafiles ADD INDEX (u_id);
ALTER TABLE item_metafiles ADD INDEX (im_timestamp);
ALTER TABLE passage_metafiles ADD INDEX (u_id);
ALTER TABLE passage_metafiles ADD INDEX (pm_timestamp);
ALTER TABLE passage_set_list ADD INDEX (ps_id);
ALTER TABLE passage_status ADD INDEX (ps_timestamp);
ALTER TABLE scoring_rubric ADD INDEX (ib_id);
ALTER TABLE scoring_rubric ADD INDEX (sr_name);
ALTER TABLE user_action_item ADD INDEX (uai_timestamp);
ALTER TABLE user_action_passage ADD INDEX (u_id);
ALTER TABLE user_action_passage ADD INDEX (uap_timestamp);
ALTER TABLE user_permission ADD INDEX (up_value);