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
import com.opencart.test.entity.OcModification;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcModificationHandler")
public class OcModificationHandler extends DelimiterFileHandler<OcModification> {

    @Inject
    @Named("DefaultJpaDao")
    public OcModificationHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcModification parseLine(List<String> headers, List<String> tokens) {
        OcModification record = new OcModification();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "modificationId":
                    record.setModificationId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "name":
                    record.setName(tokens.get(i));
                    break;

                case "code":
                    record.setCode(tokens.get(i));
                    break;

                case "author":
                    record.setAuthor(tokens.get(i));
                    break;

                case "version":
                    record.setVersion(tokens.get(i));
                    break;

                case "link":
                    record.setLink(tokens.get(i));
                    break;

                case "xml":
                    record.setXml(tokens.get(i));
                    break;

                case "status":
                    record.setStatus(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "dateAdded":
                    record.setDateAdded(new java.sql.Timestamp(parseTime(tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}