/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.opencart.test.handler;

import com.opencart.test.dao.JpaDao;
import com.opencart.test.entity.OcDownloadDescription;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcDownloadDescriptionHandler")
public class OcDownloadDescriptionHandler extends DelimiterFileHandler<OcDownloadDescription> {

    @Inject
    @Named("DefaultJpaDao")
    public OcDownloadDescriptionHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcDownloadDescription parseLine(List<String> headers, List<String> tokens) {
        OcDownloadDescription record = new OcDownloadDescription();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "downloadId":
                    record.setDownloadId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "languageId":
                    record.setLanguageId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "name":
                    record.setName(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
